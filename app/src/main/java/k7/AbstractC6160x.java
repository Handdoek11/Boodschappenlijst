package k7;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: k7.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6160x extends AbstractC6158w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6160x(g7.b bVar) {
        super(bVar, null);
        J6.r.e(bVar, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        J6.r.e(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        J6.r.e(collection, "<this>");
        return collection.size();
    }
}
