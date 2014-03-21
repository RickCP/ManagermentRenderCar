package com.rick.management.car.spring.web.common;

import java.net.URL;

public class GetDomainName
{
  public static void main(String args[]) {
  try{
  String urlAddress = "http://localhost:8080/ManagementCar/manager/admin.jv";
  URL url = new URL(urlAddress);
  String domain = url.getHost();
  System.out.println("Domain name by URL\"http://www.roseindia.net/jsf/JSFLoginApplication.shtml \" is :"
  + domain);
  }catch (Exception e){
  System.out.println("Exception caught ="+e.getMessage());
  }
  }
}
