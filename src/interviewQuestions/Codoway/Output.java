package interviewQuestions.Codoway;

    public class Output {
        private final Integer round;
        private final Integer dice1;
        private final Integer dice2;
        private final Integer dice3;
        private final Integer total1;
        private final Integer total2;
        private final Integer total3;

        public Output(Integer round, Integer dice1, Integer dice2, Integer dice3, Integer total1, Integer total2, Integer total3) {
            this.round = round;
            this.dice1 = dice1;
            this.dice2 = dice2;
            this.dice3 = dice3;
            this.total1 = total1;
            this.total2 = total2;
            this.total3 = total3;
        }

        public Integer getRound() {
            return round;
        }

        public Integer getDice1() {
            return dice1;
        }

        public Integer getDice2() {
            return dice2;
        }

        public Integer getDice3() {
            return dice3;
        }

        public Integer getTotal1() {
            return total1;
        }

        public Integer getTotal2() {
            return total2;
        }

        public Integer getTotal3() {
            return total3;
        }


}
