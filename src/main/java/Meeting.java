public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }


    @Override
    public boolean matches(String query) {
        return topic.contains(query) || project.contains(query);
    }
}
