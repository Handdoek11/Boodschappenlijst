package k7;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class O extends AbstractC6160x {

    /* renamed from: b, reason: collision with root package name */
    private final i7.f f38640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(g7.b bVar) {
        super(bVar);
        J6.r.e(bVar, "eSerializer");
        this.f38640b = new N(bVar.getDescriptor());
    }

    @Override // k7.AbstractC6158w, g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38640b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashSet a() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashSet hashSet) {
        J6.r.e(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashSet hashSet, int i8) {
        J6.r.e(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(HashSet hashSet, int i8, Object obj) {
        J6.r.e(hashSet, "<this>");
        hashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public HashSet k(Set set) {
        J6.r.e(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(HashSet hashSet) {
        J6.r.e(hashSet, "<this>");
        return hashSet;
    }
}
