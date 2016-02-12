package com.example.hud;

import com.google.api.server.spi.config.Api;

@Api(name = "hud")
public class HUDEndpoint {
 public Container getThing() {
  Container c = new Container();
  c.Text = "Hello sai ram world!";
  return c;
 }
  
 public class Container {
  public String Text;
 }
}