package ch.martinelli.vaadinvideo;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class VideoView extends VerticalLayout {

    public VideoView() {
        Video video = new Video("video1.mp4");
        video.setMaxWidth("500px");
        video.addEndedListener(() -> video.setSrc("video2.mp4"));

        add(video);
    }
}
