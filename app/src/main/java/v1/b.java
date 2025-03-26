package V1;

import I1.a;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0054a {

    /* renamed from: a, reason: collision with root package name */
    private final M1.d f5513a;

    /* renamed from: b, reason: collision with root package name */
    private final M1.b f5514b;

    public b(M1.d dVar, M1.b bVar) {
        this.f5513a = dVar;
        this.f5514b = bVar;
    }

    @Override // I1.a.InterfaceC0054a
    public Bitmap a(int i8, int i9, Bitmap.Config config) {
        return this.f5513a.e(i8, i9, config);
    }

    @Override // I1.a.InterfaceC0054a
    public int[] b(int i8) {
        M1.b bVar = this.f5514b;
        return bVar == null ? new int[i8] : (int[]) bVar.e(i8, int[].class);
    }

    @Override // I1.a.InterfaceC0054a
    public void c(Bitmap bitmap) {
        this.f5513a.c(bitmap);
    }

    @Override // I1.a.InterfaceC0054a
    public void d(byte[] bArr) {
        M1.b bVar = this.f5514b;
        if (bVar == null) {
            return;
        }
        bVar.d(bArr);
    }

    @Override // I1.a.InterfaceC0054a
    public byte[] e(int i8) {
        M1.b bVar = this.f5514b;
        return bVar == null ? new byte[i8] : (byte[]) bVar.e(i8, byte[].class);
    }

    @Override // I1.a.InterfaceC0054a
    public void f(int[] iArr) {
        M1.b bVar = this.f5514b;
        if (bVar == null) {
            return;
        }
        bVar.d(iArr);
    }
}
