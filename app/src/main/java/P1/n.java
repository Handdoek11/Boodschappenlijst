package P1;

import d2.AbstractC5709k;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface n {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final J1.e f4351a;

        /* renamed from: b, reason: collision with root package name */
        public final List f4352b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f4353c;

        public a(J1.e eVar, com.bumptech.glide.load.data.d dVar) {
            this(eVar, Collections.emptyList(), dVar);
        }

        public a(J1.e eVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f4351a = (J1.e) AbstractC5709k.d(eVar);
            this.f4352b = (List) AbstractC5709k.d(list);
            this.f4353c = (com.bumptech.glide.load.data.d) AbstractC5709k.d(dVar);
        }
    }

    a a(Object obj, int i8, int i9, J1.h hVar);

    boolean b(Object obj);
}
