package androidx.compose.ui.platform;

import java.util.Comparator;
import z6.AbstractC7088a;

/* loaded from: classes.dex */
public final class q implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Comparator f8247o;

    public q(Comparator comparator) {
        this.f8247o = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.f8247o.compare(obj, obj2);
        return compare != 0 ? compare : AbstractC7088a.a(Integer.valueOf(((S.h) obj).k()), Integer.valueOf(((S.h) obj2).k()));
    }
}
