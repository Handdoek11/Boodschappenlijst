package j$.util;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class S extends r0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ java.util.SortedSet f37262f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f37262f = sortedSet;
    }

    @Override // j$.util.r0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f37262f.comparator();
    }
}
