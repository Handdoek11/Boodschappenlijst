package M1;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements d {
    @Override // M1.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // M1.d
    public Bitmap d(int i8, int i9, Bitmap.Config config) {
        return Bitmap.createBitmap(i8, i9, config);
    }

    @Override // M1.d
    public Bitmap e(int i8, int i9, Bitmap.Config config) {
        return d(i8, i9, config);
    }

    @Override // M1.d
    public void b() {
    }

    @Override // M1.d
    public void a(int i8) {
    }
}
