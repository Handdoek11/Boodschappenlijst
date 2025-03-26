package Y1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f6048a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f6048a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f6048a;
    }
}
