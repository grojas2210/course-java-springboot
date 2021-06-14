package cl.mobdev.coursejavaspringboot.bootstrap;

import cl.mobdev.coursejavaspringboot.domain.Address;
import cl.mobdev.coursejavaspringboot.domain.Author;
import cl.mobdev.coursejavaspringboot.domain.Book;
import cl.mobdev.coursejavaspringboot.domain.Publisher;
import cl.mobdev.coursejavaspringboot.repositories.AddressRepository;
import cl.mobdev.coursejavaspringboot.repositories.AuthorRepository;
import cl.mobdev.coursejavaspringboot.repositories.BookRepository;
import cl.mobdev.coursejavaspringboot.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final AddressRepository addressRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, AddressRepository addressRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        Address address = new Address("Address line 1", "Santiago", "Santiago Centro", "8320000");
        Publisher publisher = new Publisher("Gabriela Rojas");

        publisher.getAddress().add(address);
        address.getPublishers().add(publisher);

        addressRepository.save(address);
        publisherRepository.save(publisher);

        System.out.println("Address count "+ addressRepository.count());
        System.out.println("Publisher count "+ publisherRepository.count());


        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driver Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB","3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Number of Books: "+ bookRepository.count());
        System.out.println("Publisher Number of books: "+ publisher.getBooks().size());

    }
}
