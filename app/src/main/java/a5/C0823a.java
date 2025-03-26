package a5;

import Z2.r;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import b5.InterfaceC0965a;
import e5.AbstractC5750a;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0823a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0965a f6558a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f6559b;

    /* renamed from: c, reason: collision with root package name */
    private final Point[] f6560c;

    public C0823a(InterfaceC0965a interfaceC0965a) {
        this(interfaceC0965a, null);
    }

    public int a() {
        int d8 = this.f6558a.d();
        if (d8 > 4096 || d8 == 0) {
            return -1;
        }
        return d8;
    }

    public String b() {
        return this.f6558a.b();
    }

    public C0823a(InterfaceC0965a interfaceC0965a, Matrix matrix) {
        this.f6558a = (InterfaceC0965a) r.l(interfaceC0965a);
        Rect a8 = interfaceC0965a.a();
        if (a8 != null && matrix != null) {
            AbstractC5750a.b(a8, matrix);
        }
        this.f6559b = a8;
        Point[] c8 = interfaceC0965a.c();
        if (c8 != null && matrix != null) {
            AbstractC5750a.a(c8, matrix);
        }
        this.f6560c = c8;
    }
}
