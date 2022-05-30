package repositories;

import com.google.gson.internal.PreJava9DateFormatProvider;
import models.Users;
import net.bytebuddy.asm.Advice;
import org.eclipse.jetty.server.session.JDBCSessionDataStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.sql.Date;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UsersRepoTest {

    UsersRepo ur = new UsersRepoImpl();

    @Test
    public void getUsers(){

        int id = 2;

        Users actual = ur.getUsers(id);


        Users expected = new Users(2,"user1","user1@email.com","1989-03-03","passuser1");


//        Assertions.assertEquals(expected, actual);
        assertEquals("users: " + actual.toString() + " does not equal expected users: " + expected.toString(), expected.toString(), actual.toString());


        System.out.println("Passed");



    }





}
