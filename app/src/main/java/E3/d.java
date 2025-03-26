package E3;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class d extends Property {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f2151a;

    public d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f2151a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f2151a.set(imageView.getImageMatrix());
        return this.f2151a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
