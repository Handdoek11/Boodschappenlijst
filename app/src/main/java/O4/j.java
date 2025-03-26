package o4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final List f39863a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f39864b;

    public j(int i8) {
        this.f39864b = i8;
    }

    public List a() {
        List b8 = b();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < b8.size(); i8++) {
            arrayList.add(((i) b8.get(i8)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f39863a));
    }

    public synchronized boolean c(List list) {
        this.f39863a.clear();
        if (list.size() <= this.f39864b) {
            return this.f39863a.addAll(list);
        }
        j4.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f39864b);
        return this.f39863a.addAll(list.subList(0, this.f39864b));
    }
}
