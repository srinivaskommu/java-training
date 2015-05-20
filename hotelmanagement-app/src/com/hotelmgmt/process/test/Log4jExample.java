package com.hotelmgmt.process.test;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Logger;

public class Log4jExample 
{

	   /* Get actual class name to be printed on */
	   static Logger log = Logger.getLogger(Log4jExample.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
	      log.info("Hello this is an info message");
	   }

}

