package vanthanyx.mmcdw.api.interfaces;

public interface IBowTimings {
    float getBowChargeTime();

    void setBowChargeTime(float bowChargeTime);

    int getCrossbowChargeTime();

    void setCrossbowChargeTime(int crossbowChargeTime);

    long getLastFiredTime();

    void setLastFiredTime(long lastFiredTime);
}
