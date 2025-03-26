package a2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class f {
    public i a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C0810b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C0812d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
