package ltd.v2.v2survey.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Survey {
    @SerializedName("question")
    @Expose
    private String mQuestion;

    @SerializedName("type")
    @Expose
    private String mQuestionType;

    @SerializedName("options")
    @Expose
    private String mQuestionOptions;

    @SerializedName("required")
    @Expose
    private boolean isRequired;

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public String getmQuestionType() {
        return mQuestionType;
    }

    public void setmQuestionType(String mQuestionType) {
        this.mQuestionType = mQuestionType;
    }

    public String getmQuestionOptions() {
        return mQuestionOptions;
    }

    public void setmQuestionOptions(String mQuestionOptions) {
        this.mQuestionOptions = mQuestionOptions;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
