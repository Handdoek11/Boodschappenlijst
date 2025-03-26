package R1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.y;

/* loaded from: classes.dex */
public final class l implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final y f4749a = y.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f4750b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4751c;

    /* renamed from: d, reason: collision with root package name */
    private final J1.b f4752d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.bitmap.n f4753e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4754f;

    /* renamed from: g, reason: collision with root package name */
    private final J1.i f4755g;

    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public l(int i8, int i9, J1.h hVar) {
        this.f4750b = i8;
        this.f4751c = i9;
        this.f4752d = (J1.b) hVar.c(t.f12939f);
        this.f4753e = (com.bumptech.glide.load.resource.bitmap.n) hVar.c(com.bumptech.glide.load.resource.bitmap.n.f12934h);
        J1.g gVar = t.f12943j;
        this.f4754f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f4755g = (J1.i) hVar.c(t.f12940g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f4749a.f(this.f4750b, this.f4751c, this.f4754f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f4752d == J1.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int i8 = this.f4750b;
        if (i8 == Integer.MIN_VALUE) {
            i8 = size.getWidth();
        }
        int i9 = this.f4751c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = size.getHeight();
        }
        float b8 = this.f4753e.b(size.getWidth(), size.getHeight(), i8, i9);
        int round = Math.round(size.getWidth() * b8);
        int round2 = Math.round(size.getHeight() * b8);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b8);
        }
        imageDecoder.setTargetSize(round, round2);
        J1.i iVar = this.f4755g;
        if (iVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == J1.i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
