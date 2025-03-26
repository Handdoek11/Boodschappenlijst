package E3;

import android.util.Property;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final Property f2150a = new c("childrenAlpha");

    private c(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f8 = (Float) viewGroup.getTag(D3.f.f1514D);
        return f8 != null ? f8 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f8) {
        float floatValue = f8.floatValue();
        viewGroup.setTag(D3.f.f1514D, f8);
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            viewGroup.getChildAt(i8).setAlpha(floatValue);
        }
    }
}
