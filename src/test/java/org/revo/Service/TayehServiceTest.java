package org.revo.Service;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.revo.Service.Service.CallbackImpl;
import org.revo.Service.Service.TayehService;
import org.revo.Service.domain.*;
import org.revo.Service.domain.Enum.Gender;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

import static org.revo.Service.ServiceGenerator.createService;

/**
 * Created by revo on 5/7/16.
 */
public class TayehServiceTest {
    TayehService tayehService = createService(TayehService.class, "ashraf.abdelrasool@yahoo.com", "d099b70c-60cf-4207-9bad-debfcc827c89");


    @Test
    public void testAccount() throws InterruptedException {
        tayehService.account().enqueue(new CallbackImpl<User>() {
            @Override
            public void data(User user) {
                System.out.println(user);
            }
        });
        Thread.sleep(1000);
    }

    @Test
    public void testRabbit() throws InterruptedException {
        tayehService.rabbit().enqueue(new CallbackImpl<Rabbit>() {
            @Override
            public void data(Rabbit rabbit) {
                System.out.println(rabbit);
            }
        });
        Thread.sleep(1000);
    }

    @Test
    public void testImages() throws InterruptedException {
        tayehService.images().enqueue(new CallbackImpl<List<Child>>() {
            @Override
            public void data(List<Child> children) {
                for (Child child : children) {
                    System.out.println(child);
                }
            }
        });
        Thread.sleep(1000);
    }

    @Test
    public void testImageInfo() throws InterruptedException {
        tayehService.imageInfo("572b9ba524ce6fa73ab5b486").enqueue(new CallbackImpl<Child>() {
            @Override
            public void data(Child child) {
                System.out.println(child);
            }
        });

        Thread.sleep(1000);
    }

    @Test
    public void testSuggested() throws InterruptedException {
        tayehService.suggested("572b9ba524ce6fa73ab5b486").enqueue(new CallbackImpl<List<SuggestedChild>>() {
            @Override
            public void data(List<SuggestedChild> children) {
                for (SuggestedChild child : children) {
                    System.out.println(child);
                }
            }
        });
        Thread.sleep(1000);

    }

    @Test
    public void testSearchcriteria() throws InterruptedException {
        SearchCriteria searchCriteria = new SearchCriteria();
        searchCriteria.setPage(1);
        tayehService.searchcriteria(searchCriteria).enqueue(new CallbackImpl<List<Child>>() {
            @Override
            public void data(List<Child> children) {
                for (Child child : children) {
                    System.out.println(child);
                }
            }
        });
        Thread.sleep(1000);
    }

    @Test
    public void testSearch() throws InterruptedException {
        Child child = new Child();
        child.setId("572b9ba524ce6fa73ab5b486");
        tayehService.search(child).enqueue(new CallbackImpl<List<SuggestedChild>>() {
            @Override
            public void data(List<SuggestedChild> children) {
                for (SuggestedChild child : children) {
                    System.out.println(child);

                }
            }
        });
        Thread.sleep(10000);
    }

    @Test
    public void testUpload() throws InterruptedException {
        Child child = new Child();
        child.setFile(encode("/media/revo/revo/a.jpg"));
        child.setName("i dont know");
        child.setMoreInfo("any info");
        child.setAge(12);
        child.setGender(Gender.Male);
        tayehService.upload(child).enqueue(new CallbackImpl<Void>() {
            @Override
            public void data(Void aVoid) {
                System.out.println("I think it uploaded");
            }
        });
        Thread.sleep(10000);
    }

    private String encode(String s) {
        try {
            return Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(new File(s)));
        } catch (IOException e) {
            return null;
        }
    }
}
