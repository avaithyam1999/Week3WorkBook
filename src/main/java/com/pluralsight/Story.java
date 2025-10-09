package com.pluralsight;

public class Story {
    private String title;
    private String story;

    public Story(String title, String story) {
        this.title = title;
        this.story = story;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Story{");
        sb.append("title='").append(title).append('\'');
        sb.append(", story='").append(story).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

