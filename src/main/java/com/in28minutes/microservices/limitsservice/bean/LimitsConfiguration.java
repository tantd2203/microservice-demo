package com.in28minutes.microservices.limitsservice.bean;

public class LimitsConfiguration {
  private  int minimum;
  private  int maximin;

  public LimitsConfiguration(){
      super();
  }

    public LimitsConfiguration(int minimum, int maximin) {
        this.minimum = minimum;
        this.maximin = maximin;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximin() {
        return maximin;
    }

    public void setMaximin(int maximin) {
        this.maximin = maximin;
    }
}
