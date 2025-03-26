package y6;

import java.util.AbstractList;
import java.util.List;

/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6976d extends AbstractList implements List, K6.c {
    protected AbstractC6976d() {
    }

    public abstract int b();

    public abstract Object d(int i8);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i8) {
        return d(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
