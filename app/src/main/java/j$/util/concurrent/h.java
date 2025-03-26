package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class h extends AbstractC5896a implements Iterator, Enumeration {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f37315k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i8, int i9, ConcurrentHashMap concurrentHashMap, int i10) {
        super(lVarArr, i8, i9, concurrentHashMap);
        this.f37315k = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f37315k) {
            case 0:
                l lVar = this.f37330b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.f37310j = lVar;
                a();
                return lVar.f37322b;
            default:
                l lVar2 = this.f37330b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.f37323c;
                this.f37310j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f37315k) {
        }
        return next();
    }
}
