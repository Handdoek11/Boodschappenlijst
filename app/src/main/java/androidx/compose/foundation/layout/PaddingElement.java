package androidx.compose.foundation.layout;

import I6.l;
import J6.AbstractC0650j;
import Q.y;
import c0.i;
import s.AbstractC6719b;

/* loaded from: classes.dex */
final class PaddingElement extends y {

    /* renamed from: b, reason: collision with root package name */
    private float f8045b;

    /* renamed from: c, reason: collision with root package name */
    private float f8046c;

    /* renamed from: d, reason: collision with root package name */
    private float f8047d;

    /* renamed from: e, reason: collision with root package name */
    private float f8048e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8049f;

    /* renamed from: g, reason: collision with root package name */
    private final l f8050g;

    public /* synthetic */ PaddingElement(float f8, float f9, float f10, float f11, boolean z7, l lVar, AbstractC0650j abstractC0650j) {
        this(f8, f9, f10, f11, z7, lVar);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && i.f(this.f8045b, paddingElement.f8045b) && i.f(this.f8046c, paddingElement.f8046c) && i.f(this.f8047d, paddingElement.f8047d) && i.f(this.f8048e, paddingElement.f8048e) && this.f8049f == paddingElement.f8049f;
    }

    public int hashCode() {
        return (((((((i.g(this.f8045b) * 31) + i.g(this.f8046c)) * 31) + i.g(this.f8047d)) * 31) + i.g(this.f8048e)) * 31) + AbstractC6719b.a(this.f8049f);
    }

    private PaddingElement(float f8, float f9, float f10, float f11, boolean z7, l lVar) {
        this.f8045b = f8;
        this.f8046c = f9;
        this.f8047d = f10;
        this.f8048e = f11;
        this.f8049f = z7;
        this.f8050g = lVar;
        if (f8 >= 0.0f || i.f(f8, i.f12080o.a())) {
            float f12 = this.f8046c;
            if (f12 >= 0.0f || i.f(f12, i.f12080o.a())) {
                float f13 = this.f8047d;
                if (f13 >= 0.0f || i.f(f13, i.f12080o.a())) {
                    float f14 = this.f8048e;
                    if (f14 >= 0.0f || i.f(f14, i.f12080o.a())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
