package c4;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* renamed from: c4.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1014q extends AbstractC1002e implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    final transient AbstractC1013p f12222o;

    /* renamed from: s, reason: collision with root package name */
    final transient int f12223s;

    /* renamed from: c4.q$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f12224a = H.c();

        /* renamed from: b, reason: collision with root package name */
        Comparator f12225b;

        /* renamed from: c, reason: collision with root package name */
        Comparator f12226c;
    }

    AbstractC1014q(AbstractC1013p abstractC1013p, int i8) {
        this.f12222o = abstractC1013p;
        this.f12223s = i8;
    }

    @Override // c4.AbstractC1001d
    public boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // c4.AbstractC1001d, c4.InterfaceC0992A
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1013p a() {
        return this.f12222o;
    }

    @Override // c4.AbstractC1001d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // c4.AbstractC1001d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // c4.AbstractC1001d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
