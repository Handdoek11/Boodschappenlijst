package androidx.compose.ui.platform;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Comparator f8245o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Comparator f8246s;

    public p(Comparator comparator, Comparator comparator2) {
        this.f8245o = comparator;
        this.f8246s = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.f8245o.compare(obj, obj2);
        return compare != 0 ? compare : this.f8246s.compare(((S.h) obj).m(), ((S.h) obj2).m());
    }
}
