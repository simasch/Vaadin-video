package ch.martinelli.vaadinvideo;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.notification.Notification;

@Tag("video")
public class Video extends HtmlContainer {

    private static final PropertyDescriptor<String, String> srcDescriptor =
            PropertyDescriptors.attributeWithDefault("src", "");

    public Video(String src) {
        setSrc(src);
        getElement().setProperty("controls", true);
        getElement().setProperty("autoplay", true);
    }

    public void setSrc(String src) {
        set(srcDescriptor, src);
    }

    public void addEndedListener(Runnable runnable) {
        getElement().addEventListener("ended", e -> runnable.run());
    }
}
