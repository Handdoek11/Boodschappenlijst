package V1;

import I1.a;
import R1.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import d2.AbstractC5705g;
import d2.AbstractC5710l;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class a implements J1.j {

    /* renamed from: f, reason: collision with root package name */
    private static final C0112a f5505f = new C0112a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f5506g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f5507a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5508b;

    /* renamed from: c, reason: collision with root package name */
    private final b f5509c;

    /* renamed from: d, reason: collision with root package name */
    private final C0112a f5510d;

    /* renamed from: e, reason: collision with root package name */
    private final V1.b f5511e;

    /* renamed from: V1.a$a, reason: collision with other inner class name */
    static class C0112a {
        C0112a() {
        }

        I1.a a(a.InterfaceC0054a interfaceC0054a, I1.c cVar, ByteBuffer byteBuffer, int i8) {
            return new I1.e(interfaceC0054a, cVar, byteBuffer, i8);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f5512a = AbstractC5710l.f(0);

        b() {
        }

        synchronized I1.d a(ByteBuffer byteBuffer) {
            I1.d dVar;
            try {
                dVar = (I1.d) this.f5512a.poll();
                if (dVar == null) {
                    dVar = new I1.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return dVar.p(byteBuffer);
        }

        synchronized void b(I1.d dVar) {
            dVar.a();
            this.f5512a.offer(dVar);
        }
    }

    public a(Context context, List list, M1.d dVar, M1.b bVar) {
        this(context, list, dVar, bVar, f5506g, f5505f);
    }

    private e c(ByteBuffer byteBuffer, int i8, int i9, I1.d dVar, J1.h hVar) {
        long b8 = AbstractC5705g.b();
        try {
            I1.c c8 = dVar.c();
            if (c8.b() > 0 && c8.c() == 0) {
                Bitmap.Config config = hVar.c(i.f5552a) == J1.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                I1.a a8 = this.f5510d.a(this.f5511e, c8, byteBuffer, e(c8, i8, i9));
                a8.e(config);
                a8.b();
                Bitmap a9 = a8.a();
                if (a9 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC5705g.a(b8));
                    }
                    return null;
                }
                e eVar = new e(new c(this.f5507a, a8, n.c(), i8, i9, a9));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC5705g.a(b8));
                }
                return eVar;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + AbstractC5705g.a(b8));
            }
        }
    }

    private static int e(I1.c cVar, int i8, int i9) {
        int min = Math.min(cVar.a() / i9, cVar.d() / i8);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i8 + "x" + i9 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(ByteBuffer byteBuffer, int i8, int i9, J1.h hVar) {
        I1.d a8 = this.f5509c.a(byteBuffer);
        try {
            return c(byteBuffer, i8, i9, a8, hVar);
        } finally {
            this.f5509c.b(a8);
        }
    }

    @Override // J1.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, J1.h hVar) {
        return !((Boolean) hVar.c(i.f5553b)).booleanValue() && com.bumptech.glide.load.a.g(this.f5508b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List list, M1.d dVar, M1.b bVar, b bVar2, C0112a c0112a) {
        this.f5507a = context.getApplicationContext();
        this.f5508b = list;
        this.f5510d = c0112a;
        this.f5511e = new V1.b(dVar, bVar);
        this.f5509c = bVar2;
    }
}
