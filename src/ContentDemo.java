import java.util.ArrayList;
import java.util.List;

public class ContentDemo {

    public static void main(String[] args) {

        List<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced Java", 2022, 120, "4K"));

        items.add(new PodcastEpisode("Tech Talks", 2023, 45, "Alice Johnson"));
        items.add(new PodcastEpisode("Backend Weekly", 2021, 60, "Michael Smith"));

        int currentYear = java.time.Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(
                    item.toString() +
                            " licenseCost=" +
                            item.getLicenseCost(currentYear)
            );

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads per day: " + d.getMaxDownloadsPerDay());
            }
        }
    }
}
