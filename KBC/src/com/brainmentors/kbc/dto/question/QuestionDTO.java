package com.brainmentors.kbc.dto.question;

public class QuestionDTO {
               private int id;
               private String name;
               private String options[]=new String[4];
               private int score;
               private String rightanswer;
               private String youranswer;
               
               public boolean compareanswer(){
				return rightanswer.equals(youranswer);
                }

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String[] getOptions() {
				return options;
			}

			public void setOptions(String[] options) {
				this.options = options;
			}

			public int getScore() {
				return score;
			}

			public void setScore(int score) {
				this.score = score;
			}

			public String getRightanswer() {
				return rightanswer;
			}

			public void setRightanswer(String rightanswer) {
				this.rightanswer = rightanswer;
			}

			public String getYouranswer() {
				return youranswer;
			}

			public void setYouranswer(String youranswer) {
				this.youranswer = youranswer;
			}
               
              
}
