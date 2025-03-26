package com.google.android.material.transformation;

import D3.a;
import E3.f;
import E3.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import z0.X;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    private Map f32690i;

    public FabTransformationSheetBehavior() {
    }

    private void b0(View view, boolean z7) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                this.f32690i = new HashMap(childCount);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                boolean z8 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z8) {
                    if (z7) {
                        this.f32690i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        X.w0(childAt, 4);
                    } else {
                        Map map = this.f32690i;
                        if (map != null && map.containsKey(childAt)) {
                            X.w0(childAt, ((Integer) this.f32690i.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (z7) {
                return;
            }
            this.f32690i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean H(View view, View view2, boolean z7, boolean z8) {
        b0(view2, z7);
        return super.H(view, view2, z7, z8);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.b Z(Context context, boolean z7) {
        int i8 = z7 ? a.f1376d : a.f1375c;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f32683a = f.c(context, i8);
        bVar.f32684b = new h(17, 0.0f, 0.0f);
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
