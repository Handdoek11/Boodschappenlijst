package T1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import d2.AbstractC5699a;
import d2.AbstractC5710l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List f5168a;

    /* renamed from: b, reason: collision with root package name */
    private final M1.b f5169b;

    private static final class a implements L1.c {

        /* renamed from: o, reason: collision with root package name */
        private final AnimatedImageDrawable f5170o;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f5170o = animatedImageDrawable;
        }

        @Override // L1.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f5170o;
        }

        @Override // L1.c
        public void b() {
            this.f5170o.stop();
            this.f5170o.clearAnimationCallbacks();
        }

        @Override // L1.c
        public int c() {
            return this.f5170o.getIntrinsicWidth() * this.f5170o.getIntrinsicHeight() * AbstractC5710l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // L1.c
        public Class d() {
            return Drawable.class;
        }
    }

    private static final class b implements J1.j {

        /* renamed from: a, reason: collision with root package name */
        private final h f5171a;

        b(h hVar) {
            this.f5171a = hVar;
        }

        @Override // J1.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public L1.c a(ByteBuffer byteBuffer, int i8, int i9, J1.h hVar) {
            return this.f5171a.b(ImageDecoder.createSource(byteBuffer), i8, i9, hVar);
        }

        @Override // J1.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(ByteBuffer byteBuffer, J1.h hVar) {
            return this.f5171a.d(byteBuffer);
        }
    }

    private static final class c implements J1.j {

        /* renamed from: a, reason: collision with root package name */
        private final h f5172a;

        c(h hVar) {
            this.f5172a = hVar;
        }

        @Override // J1.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public L1.c a(InputStream inputStream, int i8, int i9, J1.h hVar) {
            return this.f5172a.b(ImageDecoder.createSource(AbstractC5699a.b(inputStream)), i8, i9, hVar);
        }

        @Override // J1.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(InputStream inputStream, J1.h hVar) {
            return this.f5172a.c(inputStream);
        }
    }

    private h(List list, M1.b bVar) {
        this.f5168a = list;
        this.f5169b = bVar;
    }

    public static J1.j a(List list, M1.b bVar) {
        return new b(new h(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static J1.j f(List list, M1.b bVar) {
        return new c(new h(list, bVar));
    }

    L1.c b(ImageDecoder.Source source, int i8, int i9, J1.h hVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new R1.l(i8, i9, hVar));
        if (T1.b.a(decodeDrawable)) {
            return new a(T1.c.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f5168a, inputStream, this.f5169b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f5168a, byteBuffer));
    }
}
