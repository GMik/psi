package persistance.daos;

/**
 * Common CRUD operations
 * 
 * @author Grzegorz
 *
 * @param <T>
 */
public interface GenericDao<T> {

	T create(T t);

	T find(long id);

	T update(T t);

	void delete(long id);

}
