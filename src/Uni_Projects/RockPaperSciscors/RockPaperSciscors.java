package Uni_Projects.RockPaperSciscors;

public class RockPaperSciscors {

    String thhrow(Hand a, Hand b) {

        String result = null;

        //First hand is rock
        if(a == Hand.ROCK) {
            //Other hand is ROCK
            if (b == Hand.ROCK) { result = "Draw"; }
            //Other hand is ROCK
            if (b == Hand.PAPER) { result = "Lost"; }
            //Other hand is ROCK
            if (b == Hand.SCISSOR) { result = "Win"; }
        }

        //First hand is Paper
        if(a == Hand.PAPER) {
            //Other hand is ROCK
            if (b == Hand.ROCK) { result = "Win"; }
            //Other hand is ROCK
            if (b == Hand.PAPER) { result = "Draw"; }
            //Other hand is ROCK
            if (b == Hand.SCISSOR) { result = "Lost"; }
        }

        //First hand is Scissor
        if(a == Hand.SCISSOR) {
            //Other hand is ROCK
            if (b == Hand.ROCK) { result = "Lost"; }
            //Other hand is ROCK
            if (b == Hand.PAPER) { result = "Win"; }
            //Other hand is ROCK
            if (b == Hand.SCISSOR) { result = "Draw"; }
        }

        return result;
    }
}
