package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5895c implements Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f37280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37281c;

    public /* synthetic */ C5895c(Comparator comparator, Object obj, int i8) {
        this.f37279a = i8;
        this.f37280b = comparator;
        this.f37281c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f37279a) {
            case 0:
                int compare = this.f37280b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.f37281c).compare(obj, obj2);
            default:
                Function function = (Function) this.f37281c;
                return this.f37280b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
