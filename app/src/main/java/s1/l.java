package s1;

import androidx.work.OverwritingInputMerger;
import s1.u;

/* loaded from: classes.dex */
public final class l extends u {
    l(a aVar) {
        super(aVar.f42711b, aVar.f42712c, aVar.f42713d);
    }

    public static l d(Class cls) {
        return (l) new a(cls).b();
    }

    public static final class a extends u.a {
        public a(Class cls) {
            super(cls);
            this.f42712c.f98d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.u.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c() {
            if (this.f42710a && this.f42712c.f104j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new l(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // s1.u.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
