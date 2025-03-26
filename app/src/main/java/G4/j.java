package g4;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes2.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f36044a = new j() { // from class: g4.i
        @Override // g4.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
