package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        if(partRepository.count() == 0) {
            InhousePart wheels = new InhousePart();

            wheels.setName("Rubber Wheels");
            wheels.setPrice(100.00);
            wheels.setInv(5);
            wheels.setMinInv(1);
            wheels.setMaxInv(50);


            InhousePart handle = new InhousePart();

            handle.setName("Scooter Handles");
            handle.setPrice(50.00);
            handle.setInv(5);
            handle.setMinInv(1);
            handle.setMaxInv(50);

            InhousePart brakes = new InhousePart();

            brakes.setName("Hard Brakes");
            brakes.setPrice(60.00);
            brakes.setInv(15);
            brakes.setMinInv(1);
            brakes.setMaxInv(50);


            InhousePart seat = new InhousePart();

            seat.setName("Cushion Seats");
            seat.setPrice(25.00);
            seat.setInv(10);
            seat.setMinInv(1);
            seat.setMaxInv(50);


            InhousePart rims = new InhousePart();
            rims.setId(5);
            rims.setName("Steel Rims");
            rims.setPrice(150.00);
            rims.setInv(5);
            rims.setMinInv(1);
            rims.setMaxInv(50);

            partRepository.save(wheels);
            partRepository.save(handle);
            partRepository.save(brakes);
            partRepository.save(seat);
            partRepository.save(rims);
        }





        /*


        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());







        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */



        if(productRepository.count() == 0){

            Product electricScooter = new Product ("Electric Scooter", 400.00, 10);
            Product mobilityScooter = new Product ("Mobility Scooter", 1000.00, 10);
            Product kickScooter = new Product ("Kick Scooter", 250.00, 10);
            Product proScooter = new Product ("Pro Scooter", 500.00, 10);
            Product gasScooter = new Product ("Gas Scooter", 3000.00, 10);

            productRepository.save(electricScooter);
            productRepository.save(mobilityScooter);
            productRepository.save(kickScooter);
            productRepository.save(proScooter);
            productRepository.save(gasScooter);



        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
