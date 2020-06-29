package org.hospitality.entity;

public class stayInfo
{
     private String occupantNumber, occupantId, stayDuration, deliveries;

    private stayInfo(stayInfo.Builder builder){
        this.occupantNumber = builder.occupantNumber;
        this.occupantId = builder.occupantId;
        this.stayDuration = builder.stayDuration;
        this.deliveries = builder.deliveries;
    }

    public String getOccupantNumber() {
        return occupantNumber;
    }

    public String getOccupantId() {
        return occupantId;
    }

    public String getStayDuration() {
        return stayDuration;
    }

    public String getDeliveries() {
        return deliveries;
    }

    @Override
    public String toString() {
        return "stayInfo{" +
                "occupantNumber='" + occupantNumber + '\'' +
                ", occupantId='" + occupantId + '\'' +
                ", stayDuration='" + stayDuration + '\'' +
                ", deliveries='" + deliveries + '\'' +
                '}';
    }



    public static class Builder
    {
        private String occupantNumber, occupantId , stayDuration, deliveries ;

        public stayInfo.Builder setOccupantNumber(String occupantNumber)
        {
            this.occupantNumber = occupantNumber;
            return this;
        }

        public stayInfo.Builder setOccupantId(String occupantId)
        {
            this.occupantId = occupantId;
            return this;
        }

        public stayInfo.Builder setStayDuration(String stayDuration)
        {
            this.stayDuration = stayDuration;
            return this;
        }

        public stayInfo.Builder setDeliveries(String deliveries)
        {
            this.deliveries = deliveries;
            return this;
        }

        public stayInfo build(){
            return new stayInfo(this);
        }

    }

}
