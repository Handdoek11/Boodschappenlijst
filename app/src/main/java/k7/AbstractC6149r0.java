package k7;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* renamed from: k7.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6149r0 {
    public static final void a(int i8, int i9, i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i10 = (~i8) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(fVar.h(i11));
            }
            i10 >>>= 1;
        }
        throw new MissingFieldException(arrayList, fVar.a());
    }
}
