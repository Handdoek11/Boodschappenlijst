package k7;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: k7.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6116a0 extends AbstractC6160x {

    /* renamed from: b, reason: collision with root package name */
    private final i7.f f38668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6116a0(g7.b bVar) {
        super(bVar);
        J6.r.e(bVar, "eSerializer");
        this.f38668b = new Z(bVar.getDescriptor());
    }

    @Override // k7.AbstractC6158w, g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38668b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet a() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashSet linkedHashSet) {
        J6.r.e(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashSet linkedHashSet, int i8) {
        J6.r.e(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(LinkedHashSet linkedHashSet, int i8, Object obj) {
        J6.r.e(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet k(Set set) {
        J6.r.e(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set l(LinkedHashSet linkedHashSet) {
        J6.r.e(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
