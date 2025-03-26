package W6;

/* loaded from: classes2.dex */
public abstract class f {
    public static final d a(int i8, a aVar, I6.l lVar) {
        d bVar;
        if (i8 == -2) {
            bVar = aVar == a.SUSPEND ? new b(d.f5869a.a(), lVar) : new i(1, aVar, lVar);
        } else {
            if (i8 == -1) {
                if (aVar == a.SUSPEND) {
                    return new i(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i8 != 0) {
                return i8 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i8, lVar) : new i(i8, aVar, lVar) : new b(Integer.MAX_VALUE, lVar);
            }
            bVar = aVar == a.SUSPEND ? new b(0, lVar) : new i(1, aVar, lVar);
        }
        return bVar;
    }

    public static /* synthetic */ d b(int i8, a aVar, I6.l lVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        if ((i9 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        return a(i8, aVar, lVar);
    }
}
