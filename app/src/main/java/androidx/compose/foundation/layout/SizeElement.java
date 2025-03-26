package androidx.compose.foundation.layout;

import I6.l;
import J6.AbstractC0650j;
import Q.y;
import c0.i;
import s.AbstractC6719b;

/* loaded from: classes.dex */
final class SizeElement extends y {

    /* renamed from: b, reason: collision with root package name */
    private final float f8051b;

    /* renamed from: c, reason: collision with root package name */
    private final float f8052c;

    /* renamed from: d, reason: collision with root package name */
    private final float f8053d;

    /* renamed from: e, reason: collision with root package name */
    private final float f8054e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8055f;

    /* renamed from: g, reason: collision with root package name */
    private final l f8056g;

    public /* synthetic */ SizeElement(float f8, float f9, float f10, float f11, boolean z7, l lVar, AbstractC0650j abstractC0650j) {
        this(f8, f9, f10, f11, z7, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return i.f(this.f8051b, sizeElement.f8051b) && i.f(this.f8052c, sizeElement.f8052c) && i.f(this.f8053d, sizeElement.f8053d) && i.f(this.f8054e, sizeElement.f8054e) && this.f8055f == sizeElement.f8055f;
    }

    public int hashCode() {
        return (((((((i.g(this.f8051b) * 31) + i.g(this.f8052c)) * 31) + i.g(this.f8053d)) * 31) + i.g(this.f8054e)) * 31) + AbstractC6719b.a(this.f8055f);
    }

    public /* synthetic */ SizeElement(float f8, float f9, float f10, float f11, boolean z7, l lVar, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? i.f12080o.a() : f8, (i8 & 2) != 0 ? i.f12080o.a() : f9, (i8 & 4) != 0 ? i.f12080o.a() : f10, (i8 & 8) != 0 ? i.f12080o.a() : f11, z7, lVar, null);
    }

    private SizeElement(float f8, float f9, float f10, float f11, boolean z7, l lVar) {
        this.f8051b = f8;
        this.f8052c = f9;
        this.f8053d = f10;
        this.f8054e = f11;
        this.f8055f = z7;
        this.f8056g = lVar;
    }
}
