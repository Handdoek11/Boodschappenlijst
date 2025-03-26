package W1;

import J1.h;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f5808a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5809b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // W1.e
    public L1.c a(L1.c cVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) cVar.get()).compress(this.f5808a, this.f5809b, byteArrayOutputStream);
        cVar.b();
        return new S1.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i8) {
        this.f5808a = compressFormat;
        this.f5809b = i8;
    }
}
