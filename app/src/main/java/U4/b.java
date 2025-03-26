package U4;

import com.google.firebase.components.ComponentRegistrar;
import g4.C5807c;
import g4.e;
import g4.h;
import g4.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C5807c c5807c, e eVar) {
        try {
            c.b(str);
            return c5807c.h().a(eVar);
        } finally {
            c.a();
        }
    }

    @Override // g4.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C5807c c5807c : componentRegistrar.getComponents()) {
            final String i8 = c5807c.i();
            if (i8 != null) {
                c5807c = c5807c.t(new h() { // from class: U4.a
                    @Override // g4.h
                    public final Object a(e eVar) {
                        return b.c(i8, c5807c, eVar);
                    }
                });
            }
            arrayList.add(c5807c);
        }
        return arrayList;
    }
}
