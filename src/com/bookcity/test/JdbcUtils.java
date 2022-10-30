package com.bookcity.test;

import org.junit.Test;

import java.sql.Connection;

public class JdbcUtils {

  @Test
  public void testJdbcUtils(){
    for (int i = 0; i < 100; i++) {
      Connection connection = com.bookcity.utils.JdbcUtils.getConnection();
      System.out.println(connection);
      com.bookcity.utils.JdbcUtils.commitAndClose();
    }


  }
}
