package I1;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: I1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0054a {
        Bitmap a(int i8, int i9, Bitmap.Config config);

        int[] b(int i8);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i8);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
