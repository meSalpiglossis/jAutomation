package src.main.java.maxima.temp.robotico;
//фабрика
public class Robot {
    private final String head;
    private final String body;
    private final String legs;
    private final String hands;

    public Robot(String head, String body, String legs, String hands) {
        this.head = head;
        this.body = body;
        this.legs = legs;
        this.hands = hands;
    }

    public static class Builder {
        private String head;
        private String body;
        private String legs;
        private String hands;

        public Builder setHead(String head) {
            this.head = head;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setLegs(String legs) {
            this.legs = legs;
            return this;
        }

        public Builder setHands(String hands) {
            this.hands = hands;
            return this;
        }

        public Robot build(){
            return new Robot(head, body, legs, hands);
        }
    }
}
